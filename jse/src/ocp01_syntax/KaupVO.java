package ocp01_syntax;

public class KaupVO {
	private double height;  //키 
	private double weight; //몸무게
	private int idx;
	private String msg;
	
	//생성자
	
	public KaupVO(double height ,double weight) {
		this.height = height;
		this.weight = weight;
	}
	// getter & setter
	// Alt + Shift + s
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void setIdx(double height, double weight){
		//this.idx = ()
	}

	public String getMsg( ) {
		String msg = "";
		if(idx > 30){
			msg = "비만";
		}else if(idx > 24){
			msg = "과체중";
		}else if(idx > 20){
			msg = "정상";
		}else if(idx > 15){
			msg = "저체중";
		}else if(idx > 13){
			msg = "마름";
		}else if(idx > 10){
			msg = "영양실조";
		}else
			
		return msg;
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "카우프지수 [height=" + height + ", weight=" + weight + ", idx="
				+ idx + ", msg=" + msg + "]";
	}
	
	
	

}
