<?php

$array = array("atestkey");
if(in_array($_GET['authkey'], $array))
{
  $obj->status = 'VALID';
  $obj = json_encode($obj);
  echo $obj;
  return;
}
$obj->status = 'WRONG';
$obj = json_encode($obj);
echo $obj;

?>
