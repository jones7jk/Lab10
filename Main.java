class Main {
  public static void main(String[] args) {
   Sugar tree = new Sugar("tree");
   tree.cutShape( tree.getCookieShape(),10);
   tree.bakecookies(350, 12);
   tree.checkDecorate();
   Sugar aCookie = new Sugar();
   aCookie.checkDecorate();
  }
}