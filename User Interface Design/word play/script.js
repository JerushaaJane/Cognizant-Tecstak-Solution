function wordPlay(number){
    //fill the code
    var ans="";
    if(number<1){
        ans+= "Not Valid";
        return ans;
    }
    else if(number>50){
        ans+= "Range is High";
        return ans;
    }
    else{
            for(let i=1;i<=number;i++){
            if(i%3===0){ans+=" Tap";}
            else if(i%5===0){ans+=" Clap";}
            else if(i%3===0 && i%5===0){ans+=" Jump";}
            else{ans+=" "+i;}
            }
            return ans;
    }


}
console.log(wordPlay(16));
