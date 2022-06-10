import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff

  // quadrant 1
  for(int i = 1; i < 10; i++){
    line(0 + (i * width/20), 0,  0 + (i * width/20), height/2);
    line(0, 0 +  (i * height/20),  width/2, 0 +  (i * height/20));

  }
  // quadrant 2
  fill(207, 35, 109);
  for(int i = 0; i < 5; i++){
    for(int j = 0; j < 5; j++){
      ellipse((width / 2 + width/12) + (i * width/ 12) , height/15 + (j * height/             12), width/17, height/17);
    }
  }  

  float linex = 0;
  for(int i = 0; i < 256; i++){
    stroke(i, i, i);
    linex += (width/2) / 255.0;
    if(linex < (width / 2)){
      line(linex,height/2, linex, height);
    }
  }


    
  stroke(0,0,0);
  translate((3*width)/4, (3*height)/4);
  
    
  for(int i = 0; i < 9; i++){
    fill(220,93,52);
    ellipse(0, height/12, width / 20, height /6);
    rotate(radians(45));
    
  }
  fill(38, 158, 32);
  ellipse(0, 0, width/10, height/10);
  }
  
  
  // define other methods down here.
}