package ppj.git;

public class AreaOfCircle extends Data implements Display  {
	
	
	
public AreaOfCircle(int rad) {
	setRad(rad);
}


@Override
protected void setRad(int rad) {
	// TODO Auto-generated method stub
	this.rad = rad;
	
}

@Override
public double circle() {
	// TODO Auto-generated method stub
	int radTemp = getRad();
	
	double result;
	double pi = 3.14;
	result = pi * radTemp * radTemp;
	
	return result;
	
}





		
}
