<?php
include "connect.php";
$sql="SELECT * FROM  student";
$result=$conn->query($sql);
?>
<html>
<head>
<title>
view page</title>
</head>
<body>
<table border ="1">
<tr>
<th>Roll no</th>
<th>Name</th>
<th> Subject 1</th>
<th> Subject 2</th>
<th> Subject 3</th>
<th> Total marks</th>
</tr>

<?php
if($result->num_rows>0)
{
	while($row=$result->fetch_assoc())
{
?>

<tr>
<td> <?php echo$row['id'];?></td>
<td> <?php echo$row['name'];?></td>
<td> <?php echo$row['mark1'];?></td>
<td> <?php echo$row['mark2'];?></td>
<td> <?php echo$row['mark3'];?></td>
<td> <?php echo$row['total'];?></td>

<?php
}
}
?>
</table>
</html>
