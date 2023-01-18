<?php

include "connect.php";
$cr="CREATE DATABASE STUDENT";
if($conn->query($cr)===TRUE){
echo "database created succesfully";
}else{
echo"database creation error".$conn->error;
}

?>