package package1.Java_project539;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.21.0.4678 modeling language!*/


import java.util.*;

/**
 * Unable to update umple code due to error at [104,2]
 * Unable to update umple code due to error at [103,2]
 * Unable to update umple code due to error at [102,2]
 * Unable to update umple code due to error at [101,2]
 * Unable to update umple code due to error at [100,2]
 */
// line 7 "model.ump"
// line 183 "model.ump"
public class Map
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Map Attributes
  private int sizeX;
  private int sizeY;

  //Map Associations
  private List<Ramp> ramps;
  private List<Territory> territories;
  private List<Road> roads;
  private List<Level> levels;
  private Grid grid;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Map(int aSizeX, int aSizeY, Grid aGrid)
  {
    sizeX = aSizeX;
    sizeY = aSizeY;
    ramps = new ArrayList<Ramp>();
    territories = new ArrayList<Territory>();
    roads = new ArrayList<Road>();
    levels = new ArrayList<Level>();
    if (aGrid == null || aGrid.getMap() != null)
    {
      throw new RuntimeException("Unable to create Map due to aGrid");
    }
    grid = aGrid;
  }

  public Map(int aSizeX, int aSizeY)
  {
    sizeX = aSizeX;
    sizeY = aSizeY;
    ramps = new ArrayList<Ramp>();
    territories = new ArrayList<Territory>();
    roads = new ArrayList<Road>();
    levels = new ArrayList<Level>();
    grid = new Grid(this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSizeX(int aSizeX)
  {
    boolean wasSet = false;
    sizeX = aSizeX;
    wasSet = true;
    return wasSet;
  }

  public boolean setSizeY(int aSizeY)
  {
    boolean wasSet = false;
    sizeY = aSizeY;
    wasSet = true;
    return wasSet;
  }

  public int getSizeX()
  {
    return sizeX;
  }

  public int getSizeY()
  {
    return sizeY;
  }

  public Ramp getRamp(int index)
  {
    Ramp aRamp = ramps.get(index);
    return aRamp;
  }

  public List<Ramp> getRamps()
  {
    List<Ramp> newRamps = Collections.unmodifiableList(ramps);
    return newRamps;
  }

  public int numberOfRamps()
  {
    int number = ramps.size();
    return number;
  }

  public boolean hasRamps()
  {
    boolean has = ramps.size() > 0;
    return has;
  }

  public int indexOfRamp(Ramp aRamp)
  {
    int index = ramps.indexOf(aRamp);
    return index;
  }

  public Territory getTerritory(int index)
  {
    Territory aTerritory = territories.get(index);
    return aTerritory;
  }

  public List<Territory> getTerritories()
  {
    List<Territory> newTerritories = Collections.unmodifiableList(territories);
    return newTerritories;
  }

  public int numberOfTerritories()
  {
    int number = territories.size();
    return number;
  }

  public boolean hasTerritories()
  {
    boolean has = territories.size() > 0;
    return has;
  }

  public int indexOfTerritory(Territory aTerritory)
  {
    int index = territories.indexOf(aTerritory);
    return index;
  }

  public Road getRoad(int index)
  {
    Road aRoad = roads.get(index);
    return aRoad;
  }

  public List<Road> getRoads()
  {
    List<Road> newRoads = Collections.unmodifiableList(roads);
    return newRoads;
  }

  public int numberOfRoads()
  {
    int number = roads.size();
    return number;
  }

  public boolean hasRoads()
  {
    boolean has = roads.size() > 0;
    return has;
  }

  public int indexOfRoad(Road aRoad)
  {
    int index = roads.indexOf(aRoad);
    return index;
  }

  public Level getLevel(int index)
  {
    Level aLevel = levels.get(index);
    return aLevel;
  }

  public List<Level> getLevels()
  {
    List<Level> newLevels = Collections.unmodifiableList(levels);
    return newLevels;
  }

  public int numberOfLevels()
  {
    int number = levels.size();
    return number;
  }

  public boolean hasLevels()
  {
    boolean has = levels.size() > 0;
    return has;
  }

  public int indexOfLevel(Level aLevel)
  {
    int index = levels.indexOf(aLevel);
    return index;
  }

  public Grid getGrid()
  {
    return grid;
  }

  public static int minimumNumberOfRamps()
  {
    return 0;
  }

  public Ramp addRamp(Rectangle aRectangle)
  {
    return new Ramp(aRectangle, this);
  }

  public boolean addRamp(Ramp aRamp)
  {
    boolean wasAdded = false;
    if (ramps.contains(aRamp)) { return false; }
    Map existingMap = aRamp.getMap();
    boolean isNewMap = existingMap != null && !this.equals(existingMap);
    if (isNewMap)
    {
      aRamp.setMap(this);
    }
    else
    {
      ramps.add(aRamp);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRamp(Ramp aRamp)
  {
    boolean wasRemoved = false;
    //Unable to remove aRamp, as it must always have a map
    if (!this.equals(aRamp.getMap()))
    {
      ramps.remove(aRamp);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addRampAt(Ramp aRamp, int index)
  {  
    boolean wasAdded = false;
    if(addRamp(aRamp))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRamps()) { index = numberOfRamps() - 1; }
      ramps.remove(aRamp);
      ramps.add(index, aRamp);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRampAt(Ramp aRamp, int index)
  {
    boolean wasAdded = false;
    if(ramps.contains(aRamp))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRamps()) { index = numberOfRamps() - 1; }
      ramps.remove(aRamp);
      ramps.add(index, aRamp);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRampAt(aRamp, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfTerritories()
  {
    return 0;
  }

  public Territory addTerritory(Contourcolor aContourcolor)
  {
    return new Territory(aContourcolor, this);
  }

  public boolean addTerritory(Territory aTerritory)
  {
    boolean wasAdded = false;
    if (territories.contains(aTerritory)) { return false; }
    Map existingMap = aTerritory.getMap();
    boolean isNewMap = existingMap != null && !this.equals(existingMap);
    if (isNewMap)
    {
      aTerritory.setMap(this);
    }
    else
    {
      territories.add(aTerritory);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTerritory(Territory aTerritory)
  {
    boolean wasRemoved = false;
    //Unable to remove aTerritory, as it must always have a map
    if (!this.equals(aTerritory.getMap()))
    {
      territories.remove(aTerritory);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addTerritoryAt(Territory aTerritory, int index)
  {  
    boolean wasAdded = false;
    if(addTerritory(aTerritory))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTerritories()) { index = numberOfTerritories() - 1; }
      territories.remove(aTerritory);
      territories.add(index, aTerritory);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTerritoryAt(Territory aTerritory, int index)
  {
    boolean wasAdded = false;
    if(territories.contains(aTerritory))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTerritories()) { index = numberOfTerritories() - 1; }
      territories.remove(aTerritory);
      territories.add(index, aTerritory);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTerritoryAt(aTerritory, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfRoads()
  {
    return 0;
  }

  public Road addRoad(Tile aStart, Tile aEnd, Tile... allTiles)
  {
    return new Road(aStart, aEnd, this, allTiles);
  }

  public boolean addRoad(Road aRoad)
  {
    boolean wasAdded = false;
    if (roads.contains(aRoad)) { return false; }
    Map existingMap = aRoad.getMap();
    boolean isNewMap = existingMap != null && !this.equals(existingMap);
    if (isNewMap)
    {
      aRoad.setMap(this);
    }
    else
    {
      roads.add(aRoad);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRoad(Road aRoad)
  {
    boolean wasRemoved = false;
    //Unable to remove aRoad, as it must always have a map
    if (!this.equals(aRoad.getMap()))
    {
      roads.remove(aRoad);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addRoadAt(Road aRoad, int index)
  {  
    boolean wasAdded = false;
    if(addRoad(aRoad))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRoads()) { index = numberOfRoads() - 1; }
      roads.remove(aRoad);
      roads.add(index, aRoad);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRoadAt(Road aRoad, int index)
  {
    boolean wasAdded = false;
    if(roads.contains(aRoad))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRoads()) { index = numberOfRoads() - 1; }
      roads.remove(aRoad);
      roads.add(index, aRoad);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRoadAt(aRoad, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfLevels()
  {
    return 0;
  }

  public Level addLevel(int aLevelnum, Tab aTab)
  {
    return new Level(aLevelnum, aTab, this);
  }

  public boolean addLevel(Level aLevel)
  {
    boolean wasAdded = false;
    if (levels.contains(aLevel)) { return false; }
    Map existingMap = aLevel.getMap();
    boolean isNewMap = existingMap != null && !this.equals(existingMap);
    if (isNewMap)
    {
      aLevel.setMap(this);
    }
    else
    {
      levels.add(aLevel);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeLevel(Level aLevel)
  {
    boolean wasRemoved = false;
    //Unable to remove aLevel, as it must always have a map
    if (!this.equals(aLevel.getMap()))
    {
      levels.remove(aLevel);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addLevelAt(Level aLevel, int index)
  {  
    boolean wasAdded = false;
    if(addLevel(aLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLevels()) { index = numberOfLevels() - 1; }
      levels.remove(aLevel);
      levels.add(index, aLevel);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLevelAt(Level aLevel, int index)
  {
    boolean wasAdded = false;
    if(levels.contains(aLevel))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLevels()) { index = numberOfLevels() - 1; }
      levels.remove(aLevel);
      levels.add(index, aLevel);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLevelAt(aLevel, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=ramps.size(); i > 0; i--)
    {
      Ramp aRamp = ramps.get(i - 1);
      aRamp.delete();
    }
    for(int i=territories.size(); i > 0; i--)
    {
      Territory aTerritory = territories.get(i - 1);
      aTerritory.delete();
    }
    for(int i=roads.size(); i > 0; i--)
    {
      Road aRoad = roads.get(i - 1);
      aRoad.delete();
    }
    for(int i=levels.size(); i > 0; i--)
    {
      Level aLevel = levels.get(i - 1);
      aLevel.delete();
    }
    Grid existingGrid = grid;
    grid = null;
    if (existingGrid != null)
    {
      existingGrid.delete();
    }
  }

  // line 13 "model.ump"
   public void save(){
    
  }

  // line 16 "model.ump"
   public void load(){
    
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "sizeX" + ":" + getSizeX()+ "," +
            "sizeY" + ":" + getSizeY()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "grid = "+(getGrid()!=null?Integer.toHexString(System.identityHashCode(getGrid())):"null")
     + outputString;
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  

  
}