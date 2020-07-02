PImage face;

void setup() {
   face = loadImage("cat.jpg");
    size(800,600);
    face.resize(800,600);
}
void draw() {
  background(face);
  if(mouseX < 205){
    mouseX = 205;}
  if(mouseX > 280){
    mouseX = 280;}
  if(mouseY < 220){
    mouseY = 220;}
  if(mouseY > 295){
    mouseY = 295;}
  fill(#FFFFFF);
  ellipse(243,260,90,90);
  fill(#050000);
  ellipse(mouseX,mouseY,40,40);
  fill(#FFFFFF);
  ellipse(435,260,90,90);
  fill(#050000);
  ellipse(mouseX+192,mouseY,40,40);
  

}
