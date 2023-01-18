<?php
 $conn=mysqli_connect('localhost','root','','student');
if($conn->connect_error){
die("connection failed".$conn->connect_errror);
}
echo"connected successfully";