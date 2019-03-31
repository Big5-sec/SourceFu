package sourcefu.JS.helpers;

import java.util.ArrayList;
import java.util.List;

public class Symbol { 
    String name;      // All symbols at least have a name
    List<Integer> index= new ArrayList<Integer>(); //a list of known indexes in tokens for easy rewrite
    String altname;
    boolean isFuncCall = false;
    
    //constructors
	public Symbol(String name) { this.name = name; }
    public Symbol(String name, Integer index) { this(name); this.index.add(index); }
    public Symbol(String name, Integer index,String altname) { this(name,index); this.altname=altname;}
    public Symbol(String name, Integer index,String altname, boolean isFuncCall) { this(name,index,altname); this.isFuncCall=isFuncCall;}
    public Symbol(String name, Integer index, boolean isFuncCall) { this(name,index); this.isFuncCall=isFuncCall;}
    
    //normal operations

    public void addIndex(Integer index) {
    	this.index.add(index);
    }
    
    //setters and getters
    
    public List<Integer> getIndex() {
		return index;
	}
    
	public void setIndex(List<Integer> index) {
		this.index = index;
	}
	
    public String getAltname() {
		return altname;
	}
    
	public void setAltname(String altname) {
		this.altname = altname;
	}
    
    public String getName() { return name; }
    
    public boolean getisFuncCall() {return this.isFuncCall;}
    
    public String toString() {
        return '<'+getName()+":"+String.valueOf(index)+":"+altname+'>';
    }
}
