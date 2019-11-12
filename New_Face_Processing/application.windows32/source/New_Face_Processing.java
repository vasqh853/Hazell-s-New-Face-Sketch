import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class New_Face_Processing extends PApplet {

int r, r1, h, n, s; //float is with decimal numbers, integer is with whole numbers
int chooseExpress = 0;

public void setup (){
  
  frameRate(8);
  
  r = PApplet.parseInt(random(10,20));
  r1 = PApplet.parseInt(random(20,40));
  h = PApplet.parseInt(random(200,00));
  n = 70;
  s = 90;
}

public void draw (){
  background(220);
 
  stroke(0);
  strokeWeight(5);
  
  fill(209,182,109);// face
  ellipse(width/2,height/2,h,h);
  
  
  
  //left white eye 
  fill(201, 189, 201);
  ellipse(160,170,60,30);
  
  
  
  //right white eye 
  
  fill(201, 189, 201);
  ellipse(238,170,60,30);
  
 

 

  
  
  //Nose
  
  fill(86, 86, 120);
  rect(195,190,18,40);
  
  
//neck
  n = PApplet.parseInt(map(h, 200, 400, -110, -10));
  fill(209,182,109);
  rect(180,410,50,n);
  
  
  
 
  
//Right shoulder
  s = PApplet.parseInt(map(h, 200,400, 60, 150));
  fill(209,182,109);
arc(277, 400, 80,s, PI, TWO_PI);

  
  //left shoulder

  fill(209,182,109);
arc(138, 400, 80, s, PI, TWO_PI);

if (chooseExpress == 0) {
  
express1();
}
if(chooseExpress == 1) {
  
express2();
}

}
public void mousePressed(){
  
  r = PApplet.parseInt(random(10,20));
 r1 = PApplet.parseInt(random(20, 40));
 h= PApplet.parseInt(random(200,400));
 
 chooseExpress = PApplet.parseInt(random(0, 2)); // inclusive, exclusive = 0->1 (NOT 0->2)
 println(chooseExpress);
 
 }
 
 public void express1(){
   
    fill(180, 29, 159); //left eye
  ellipse(160, 170, r, r);
  
  fill(163, 48, 209);
rect(140,130,40,5);// left eyebrow
   
   
   
     fill(163, 48, 209);
  rect(214,140, 40,5);// right eyebrow
  
     fill(180, 29, 159); // right eye 
  ellipse(238,170,r1,r1);
  
  
  fill(50, 54, 168);
arc(200, 300, 90, 90, PI, TWO_PI);// mouth


 //Teeth
  fill(67, 162, 224);
  rect(188,255,10,20);
  rect(200,255,10,20);
  
  
  fill(171, 31, 171);// hair
  ellipse(140,100,40,40);
  ellipse(160,90,40,40);
  ellipse(170,70,40,40);
  ellipse(170,70,40,40);
  ellipse(140,70,40,40);
  ellipse(190,70,40,40);
  ellipse(210,70,40,40);
    ellipse(214,70,40,40);
    ellipse(240,70,40,40);
    ellipse(270,89,40,40);
  ellipse(140,70,40,40); 
  ellipse(140,70,40,40);
  
  
 }
 
 public void express2(){
     fill(180, 29, 159); //left eye
 rect(150, 163, r, r);

   
        fill(180, 29, 159); // right eye 
  rect(228,160,r1,r1);
  
    fill(50, 54, 168);
arc(200, 250, 90, 90, 0, PI, CHORD);

noFill();
stroke(235, 0, 59);
strokeWeight(6);


beginShape();

curveVertex (200,120); 
curveVertex (220,145);
curveVertex(230, 160);
curveVertex (250,180);
curveVertex (260,200);
curveVertex (275,220);
curveVertex (280,240);
curveVertex (300,275);
  endShape();
 }
   
   
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "New_Face_Processing" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
