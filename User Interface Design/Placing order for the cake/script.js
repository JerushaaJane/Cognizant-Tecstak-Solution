function OrderCake(str){
  let n=str.length;
  var cakeWeightInGrams=str[0]+str[1]+str[2]+str[3];
  var flavor=str.substring(4,n-3);
  var orderId=str[n-3]+str[n-2]+str[n-1];
  let price=Math.round((cakeWeightInGrams/1000)*450);
  let cakeWeightInKg=Math.round((cakeWeightInGrams/1000));

  return('Your order for '+cakeWeightInKg+' kg '+flavor+" cake has been taken. You are requested to pay Rs. "+price+" on the order no "+orderId);

}
console.log(OrderCake('5848ButterBlast485'));
