class Cookie {
private int cookieNumber, bakeTemp, bakeTime;

private boolean isBaked;

 
 Cookie() {
cookieNumber = 0;
bakeTemp = 0;
bakeTime= 0;
isBaked= false;
}
 
Cookie(int aCookieNumber, int a, int b) {
cookieNumber= aCookieNumber;
bakeTemp= a;
bakeTime= b;
isBaked=  false; }

boolean IsReady() {
return isBaked;
}
void setCookieNumber(int aCookieNumber) {
cookieNumber =  aCookieNumber;
}


void bakecookies(int a ,int b){

System.out.println(
cookieNumber + " cookies were baked at  " +  a +"  degrees F for " + b +"  minutes");
isBaked =true;
}


}