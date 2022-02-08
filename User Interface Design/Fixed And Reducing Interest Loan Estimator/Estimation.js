
/*

    Fill with appropriate and required javascript global variables  code here

*/
const p=document.getElementById('principalAmount');
const n=document.getElementById('tenure');
const r=document.getElementById('tenure');
function EstimateReducingInterestLoan()
{
	/* Fill with required javascript code to read input values from HTML Components  */
	const Principal=document.getElementById('principalAmount').value;
	const InterestPerYear=document.getElementById('tenure').value;
	const InterestPerMonth=InterestPerYear/1200;
	const TenureMonth=document.getElementById('tenure').value;

	    var rEMI=calculateEMI(Principal,InterestPerMonth,TenureMonth);
      var rPAY=totalPayment(TenureMonth,rEMI);
      var rINT=totalInterest(rPAY,Principal);
      EstimateFixedInterestLoan(Principal,InterestPerYear,TenureMonth);
}

function calculateEMI(P,R,N){
    /* Fill with required javascript code here  */
    var reducingEMI=P * R * (Math.pow((1 + R), N) / (Math.pow((1 + R), N) - 1));
    document.getElementById("EMI").innerHTML = Number(reducingEMI).toFixed(2).toString();/*Assign emi value here*/
		return reducingEMI;
}
function totalPayment(TenureMonth,rEMI){

	/* Fill with required javascript code here  */
	/* tenure*reducingEMI */
		var reducingPAYMENT=TenureMonth*rEMI;
    document.getElementById("tPayment").innerHTML = Number(reducingPAYMENT).toFixed(2).toString(); /*Assign total payment value here*/
		return reducingPAYMENT;
}
function totalInterest(rPAY,Principal){
/* Fill with required javascript code here  */
    var reducingINTEREST=rPAY-Principal;
    document.getElementById("tInterest").innerHTML = Number(reducingINTEREST).toFixed(2).toString(); /*Assign total Interest value here*/
		return reducingINTEREST;
}

function EstimateFixedInterestLoan(Principal,InterestPerYear,TenureMonth)
{
    /* Fill with required javascript code here  */
		/*const fixedINTEREST=Principal*InterestPerYear*TenureMonth/1200;
    document.getElementById("tInterestFixed").innerHTML = fixedINTEREST.toFixed(2).toString(); /*Assign total Interest value here*/

     /* Fill with required javascript code here  */
		/*const fixedPAYMENT=Principal+fixedINTEREST;
    document.getElementById("tPaymentFixed").innerHTML = fixedPAYMENT.toFixed(2).toString(); /*Assign total payment value here*/

     /* Fill with required javascript code here  */
		 /*const fixedEMI=fixedPAYMENT/TenureMonth;
    document.getElementById("EMIFixed").innerHTML = fixedEMI.toFixed(2).toString(); /*Assign emi  value here*/
		const InterestFixed = Principal * InterestPerYear * TenureMonth / 1200;
    const PaymentFixed = Principal + InterestFixed;
    const emiFixed = PaymentFixed / TenureMonth;

    document.getElementById("tInterestFixed").innerHTML = InterestFixed.toFixed(2).toString();
    document.getElementById("tPaymentFixed").innerHTML = Number(PaymentFixed).toFixed(2).toString();
    document.getElementById("EMIFixed").innerHTML = Number(emiFixed).toFixed(2).toString();




}
