#What is the command to list the file or directory names in descending order?
ls-rt

#What is the command to list the contents of the current directory in comma separated fashion ?
ls -m

#Copy the file Eider to directory Mammals. Note: assume that you are inside your home directory and always specify only relative path.
cp livingthings/birds/flyingbirds/eider livingthings/animals/mammals/

#Copy the file Eagle to Non-Flying Birds directory.
cp livingthings/birds/flyingbirds/eagle livingthings/birds/nonflyingbirds/

#Copy the whole directory Birds to Plants.
cp -rf livingthings/birds livingthings/plants

#Copy all the sub-directories and the files under COLORS directory to SHAPE.
cp -ir mydir/colors/basic mydir/colors/blended mydir/shape/

#Move the file dog from MAMMALS to SHAPE.
mv mydir/animals/mammals/dog mydir/shape

#Move the file snakes  to SHAPE
mv mydir/animals/reptiles/snakes mydir/shape/

#Use the grep command to display all lines in teknoscript.txt  that start with echo.
grep ^echo teknoscript.txt

#Which command will display the lines in the file teknoscript.txt  that are not comment lines( #)?
grep -v ^# teknoscript.txt

#Write a command to list all the lines from the file "employee.txt" ending with a semicolon.
grep ';$' employee.txt

#Write a command to list all the lines from the file “employee.txt” which does not end with semicolon.
grep -v ';$' employee.txt

:'Write a shell script using for loop to print the following pattern.
1
22
333
4444
55555'

#!/bin/sh
for ((i=1;i<=5;i++))
do
for ((j=1;j<=i;j++))
do
   echo -e  "$i\c"
done
echo ""
done

:'Write Shell script to split the below file into two files male_nominee.txt and female_nominee.txt based on gender. If file male_nominee.txt or female_nominee.txt already exists, then append the content.

Display the contents of female_nominee.txt and male_nominee.txt

names.txt

23|Arjun|Male

24|Akshara|Female

17|Aman|Male

19|Simran|Female'

awk -F'|' '
   $3 == "Male"   { print >> "male_nominee.txt"   }
   $3 == "Female" { print >> "female_nominee.txt" }
          ' names.txt'
          
          
 :'Write a shell script which displays the total number of words, characters, lines in a file. Assume the file name is given as command line argument.

Sample Output:

Number of characters in test.txt is 20

Number of words in test.txt is 3

Number of lines in test.txt is 3'

for F in ${*}
do
   echo
   c=$( wc -c < ${F})
   echo "Number of characters in ${F} is $c"
   echo
   w=$( wc -w < ${F} )
   echo "Number of words in ${F} is $w"
   echo
   l=$( wc -l < ${F})
   echo "Number of lines in ${F} is $l"
done
