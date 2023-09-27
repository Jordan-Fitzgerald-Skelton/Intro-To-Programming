/*
Garden.java
@BSHC1
21-2-2022
*/
public class TemplateClass{
	//data members
	private final double PRICE = 35.00;
	private String varName;


	//constructors - default
	public TemplateClass(){
		//you can initialise your variables here

	}

	//constructors - with parameter
	public TemplateClass(String varName){
		this.varName = varName;
	}

	//set methods - one for every input
	public void setVarName(String varName){
		this.varName = varName;
	}

	/*
	public void setVarName(datatype varName){
			this.varName = varName;
	}
	*/

	//my other methods
	public void methodName(){
		//body of the menthod here
	}



	//get methods - one for every output
	public String getVarName(){
		return varName;
	}
	/*
	public <datatype> getVarName(){
		return varName;
	}

	*/
}