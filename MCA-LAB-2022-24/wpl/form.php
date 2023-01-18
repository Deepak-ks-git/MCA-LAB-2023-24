<?php
include "connect.php";
if(isset($_POST['submit']))
{
$name=$_POST['name'];
$id=$_POST['roll'];
$mark1=$_POST['mark1'];
$mark2=$_POST['mark2'];
$mark3=$_POST['mark3'];
$total=$mark1+$mark2+$mark3;
  
$sql="INSERT INTO student(name,id,mark1,mark2,mark3,total) VALUES('$name','$id','$mark1','$mark2','$mark3','$total')";
if(mysqli_query($conn,$sql)){
echo "table records inserted successfully";}
else {
echo" Error :".mysqli_query($conn);
}
}




?>
<html>
<head>
<body>
<h2>MARK LIST FORM</h2>
<form action="" method="POST">
<fieldset>
<legend>ENTER YOUR EXAM DETAILS</legend>
name<input name="name"><br>
roll no<input name="roll"><br>
MARKS DETAILS :<br>
subject 1<input name="mark1"><br>
subject 2<input name="mark2"><br>
subject 3<input name="mark3"><br>
<input type="submit" name="submit" value="submit">




</fieldset>
</body>
<html>