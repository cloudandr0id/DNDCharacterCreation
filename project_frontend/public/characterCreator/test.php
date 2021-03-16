<?php
$NAME=$_REQUEST['Name'];
$STRENGTH=$_REQUEST['Strength'];
$DEX=$_REQUEST['Dexterity'];
$CON=$_REQUEST['Constitution'];
$WIS=$_REQUEST['Wisdom'];
$INT=$_REQUEST['Intelligence'];
$CHA=$_REQUEST['Charisma'];
$HP=$_REQUEST['HP'];
echo <<<TEXT
<p>Name is: $NAME</p>
<p>Strength is: $STRENGTH</p>
<p>Dex is: $DEX</p>
<p>Con is: $CON</p>
<p>Wis is: $WIS</p>
<p>Int is: $INT</p>
<p>Cha is: $CHA</p>
<p>HP is: $HP</p>
TEXT;
?>