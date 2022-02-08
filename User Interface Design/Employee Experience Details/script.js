
class Employee
{
constructor(name,designation,year_of_experience){
    this.name=name;
    this.designation=designation;
    this.year_of_experience=year_of_experience;
}
}

function createEmployee(name, designation, year_of_experience)
{
    let obj=new Employee(name,designation,year_of_experience)
    return obj;

}
function displayEmployee(name,designation,year_of_experience){
    let obj=createEmployee(name,designation,year_of_experience)
    if(validateObject(obj)){
        let currentDate=new Date()
        let actual_year_of_experience=currentDate.getFullYear()-obj.year_of_experience-2;
        let result=obj.name+" is serving the position of "+obj.designation+" since "+actual_year_of_experience;
        console.log(result);
        return result;
    }
}
displayEmployee("Jerold","Manager",15);
function validateObject(employee)
{
if(employee instanceof Employee){
    return true;
}
}
