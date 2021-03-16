<?php
session_start();
 
if (isset($_GET['action']) && ('logout' == $_GET['action'])) {
    unset($_SESSION['id']);
}
 
if (isset($_SESSION['id'])) {
    ?>
    <h3>Welcome User ! <a href="?action=logout">Logout</a></h3>
    <?php
} else { //redirect to login page
    header('Location: index.php');
}
?>