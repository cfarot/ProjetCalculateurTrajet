package calculateur.interfaces;

import java.util.ArrayList;

import calculateur.abstracts.Station;

public interface ILigne {
	public void setNameLigne(String name);
	public String getNameLigne();
	public void addStation(Station station);
	public ArrayList<Station> getListStation();
}
