<!DOCTYPE html>
<html>
<head>

<h2>JavaScript Do/While Loop</h2>



<script>
var i = 1;
var j = 1;

do {

	j=1;
	do {    	
        document.write('#');
        j++;
    }while(j<=i);
    document.write('<br/>');

i++;
}while(i<10);

</script>

</head>
</html>
