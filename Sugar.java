
class Sugar extends Cookie {
 String cookieShape;
 Boolean isDecorated;


Sugar() {
cookieShape = "";
isDecorated = false;


}
Sugar( String aCookieShape) {
cookieShape = aCookieShape;
isDecorated = false;


}

String getCookieShape() {
return cookieShape;
}
void changeShapes (String aCookieShape) {
cookieShape = aCookieShape;
}

void cutShape( String cookieShape , int cookies){

System.out.println(
cookies + "  cookies were cut into   " + cookieShape);
super.setCookieNumber(cookies);
}

void checkDecorate(){
  if (super.IsReady()== true){
    isDecorated=true;
    System.out.println(
 "The cookies were decorated");
   } else {

    System.out.println(
 "Make sure to bake cookies first");
  }
}
}