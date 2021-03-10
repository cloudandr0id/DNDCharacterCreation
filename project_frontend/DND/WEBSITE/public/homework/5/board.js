function Board(canvas) {
  this.cells = this._createMatrix(Board.GRID_WIDTH, Board.GRID_HEIGHT);

  this.art = new Art(canvas, Board.CELL_WIDTH, Board.CELL_PADDING);
  this.canvas = canvas;
}

Board.CELL_WIDTH = 190;
Board.CELL_PADDING = 50;
Board.GRID_WIDTH = 5;
Board.GRID_HEIGHT = 5;

Board.prototype._createMatrix = function (width, height, opt_val) {
  var m = [];
  var i, j, row;

  for (i = 0; i < width; i++) {
    row = [];
    for (j = 0; j < height; j++) {
      row.push(opt_val);
    }
    m.push(row);
  }

  return m;
}

/**
 * Initializes the board.
 */
Board.prototype.init = function () {
  this.canvas.onclick = this.handleClickEvent.bind(this);
  this.show();
}

Board.prototype.handleClickEvent = function (e) {
  var rect = this.canvas.getBoundingClientRect();
  var x = (e.clientX - rect.left) * 2;
  var y = (e.clientY - rect.top) * 2;

  var cell = this.getCellFromCoordinates(x, y);

  if (cell) {
    this.triggerCell(cell[0], cell[1]);
    this.show();
  }
}

Board.prototype.triggerCell = function (x, y) {
  this.toggleCellState(x, y);
  this.toggleCellState(x, y - 1);
  this.toggleCellState(x + 1, y);
  this.toggleCellState(x, y + 1);
  this.toggleCellState(x - 1, y);
}

Board.prototype.toggleCellState = function (x, y) {
  if (x < 0 || x >= Board.GRID_WIDTH) return;
  if (y < 0 || y >= Board.GRID_HEIGHT) return;

  this.cells[x][y] = !this.cells[x][y];
}

Board.prototype.getCellFromCoordinates = function (x, y) {
  var tile = Board.CELL_WIDTH + Board.CELL_PADDING;

  if (x > (Board.CELL_WIDTH + Board.CELL_PADDING) * Board.GRID_WIDTH) return null;
  if (y > (Board.CELL_WIDTH + Board.CELL_PADDING) * Board.GRID_WIDTH) return null;

  if (x % tile > Board.CELL_PADDING && y % tile > Board.CELL_PADDING) {
    return [Math.floor(x / tile), Math.floor(y / tile)];
  } else {
    return null;
  }
}

Board.prototype.show = function () {
  this.art.clear();

  var i, j;
  for (i = 0; i < Board.GRID_WIDTH; i++) {
    for (j = 0; j < Board.GRID_HEIGHT; j++) {
      this.art.drawCell(i, j, this.cells[i][j]);
    }
  }
};