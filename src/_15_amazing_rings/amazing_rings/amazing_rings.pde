int x=300;
int x2=1600;
void setup(){
  size(2000,2000);
  
  
}

void draw(){
  background(#FFFFFF);
  for (int i = 20; i>1; i--) {
    noFill();
  ellipse(x,500, i*25,i*25);
} 
for (int i = 20; i>1; i--) {
  ellipse(x2,500, i*25,i*25);
}
x+=3;
x2-=3;
if (x2<=0){
 x2=2000; 
}
if(x>=2000){
 x=0; 
}
}
