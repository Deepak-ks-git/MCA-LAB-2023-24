<?php 
$marks=array(
    "derick"=>array("physics"=>"40","chemistry"=>"39","maths"=>"37"),
    "gordon"=>array("physics"=>"35","chemistry"=>"36","maths"=>"37"),
    "vicky"=>array("physics"=>"40","chemistry"=>"39","maths"=>"39"),
    "adam"=>array("physics"=>"38","chemistry"=>"39","maths"=>"40"));
echo "<table border=2>
<tr>
    <th colspan=4>
    Internal marks
    </th>
</tr>
<tr>
    <th>name</th>
    <th>physics</th>
    <th>chemistry</th>
    <th>maths</th>

</tr>

";

foreach($marks as $name=>$marks)
{
    echo"<tr><td>".$name."</td>";
    foreach($marks as $num=>$values)
    {
        echo"<td>".$values."</td>";
    }
    echo"</tr>";
}
echo"</table>";

?>