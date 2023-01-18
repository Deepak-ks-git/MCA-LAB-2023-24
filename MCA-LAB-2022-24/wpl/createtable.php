<?php 
include "connect.php";
$sql="CREATE TABLE student(id int primary key,name varchar(20) not null ,mark1 int,mark2 int,mark3 int,total int)";
if(mysqli_query($conn,$sql)){
echo "table created";}
else
{
echo "error creation table:".mysqli_error($conn);
}


?>
