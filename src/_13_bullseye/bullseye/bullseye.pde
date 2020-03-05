void setup(){
size(1000,1000);
  
}
void draw(){
  
for (int i = 9; i>1; i--) {
  ellipse(500,500, i*100,i*100);
  if (i%2==0){
    fill(#810101);
  }else{
    fill(#000000);
}
}

}
