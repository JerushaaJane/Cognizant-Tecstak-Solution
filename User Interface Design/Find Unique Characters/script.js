function modifyString(str)
{
  //let removeWhiteSpace=str.replace(/\s+/g, '');
  //  return removeWhiteSpace.toLowerCase();
  var uniqueStr="";
  for(var i=0;i<str.length;i++){
    if(uniqueStr.includes(str[i])===false){
      uniqueStr[i]+=str[i];
    }
  }
  uniqueStr=uniqueStr.replace(/\s+/g,'').toLowerCase();
  return uniqueStr;
}

function uniqueCharacters(str)
{
 let s=modifyString(str);
 let result=new Set(s)
  result=Array.from(result).join('')
  return result

}
console.log(uniqueCharacters("Welcome to the Javascript course"));
