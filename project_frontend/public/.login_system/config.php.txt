<?php
$conn = new mysqli('DB_HOST', 'DB_USER', 'DB_PASSWORD', 'DB_NAME');
 
if ($conn->connect_errno) {
    echo "Error: " . $conn->connect_error;
}
?>