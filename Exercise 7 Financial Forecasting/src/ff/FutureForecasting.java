package ff;

public class FutureForecasting {
	public double Forecast(double p,double r,int y) {
		if( y== 0) {
			return p;
		}
		return Forecast(p,r,y-1) * (1+r);
	}
}
