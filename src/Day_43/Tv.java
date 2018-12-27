package Day_43;

public class Tv {
private int channel;
private int volumeLevel;
private boolean on;
private String brand;



public Tv(){
System.out.println("creating Tv object using no Args-Costucter");	
}
public Tv(String brand) {
	System.out.println("Creating object by using one arg constructer");
	this.brand=brand;
}

public int getChannel() {
	return channel;
}

public void setChannel(int channel) {
	if(on==true&&channel>0&&channel<121) {
		this.channel = channel;
	}else {
		System.out.println("Error: Tv must be tur on or Valume valume must be valid");
	}
	
	
}

public int getVolumeLevel() {
	return volumeLevel;
}

public void setVolumeLevel(int volumeLevel) {
	if(on&&volumeLevel>0&&volumeLevel<=7) {
		this.volumeLevel = volumeLevel;
	}else {
		System.out.println("Error: Tv must be tur on");
	}
	
	
}

public boolean isOn() {
	return on;
}

public void turnOn() {
	if(isOn()) {
	System.out.println("Tv is already on");	
	}else {
		this.on=true;
	}
}

public void turnOff() {
	if(!isOn()) {
		
		this.on=false;
		
	}else {
		System.out.println("Tv is not on");
	}
}
public void channelUp() {
	if(isOn()&&getChannel()<120) {
		channel++;
	}
}
public void channelDown() {
	if(isOn()&&channel>1) {
		channel--;
	}
}

public void volumeUp() {
	if(isOn()&&volumeLevel<7) {
		volumeLevel++;
	}
}
public void volumeDown() {
	if(isOn()&&volumeLevel>1) {
		volumeLevel--;
	}
}


public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

}
