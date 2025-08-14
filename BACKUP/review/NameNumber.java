public class NameNumber {
 public String lastName; 
 public String telNumber; 
 public NameNumber() {} 
 public NameNumber(String name, String number) {
 lastName = name;
 telNumber = number;
 }
 public void setLastName(String name){
    lastName = name;
 }
 public String getLastName() {
 return lastName;
 }
public void setTelNumber(String number){
    telNumber = number;
 }
 public String getTelNumber() {
 return telNumber;
 }
}