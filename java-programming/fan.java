class fan
{
	String co;
    	int sp;
	bool to;
	int r;
	fan()
	{
		System .out. println("Default Constructor");
		System .out. println("This is the description of 1st");
		co="Brown";
		sp= 12;
		to=vn;
		r=7;
System. out. println("The colour is :-"+co+" ,speed :- "+sp+", turned on :- "+to+", radius :- "+r );
	}
	fan(String co, int sp, int r)
	{
		System .out. println("This is the description of 2st");
System. out. println("The colour is :"+co+" ,speed : "+sp+", turned on :- "+to+" , radius : "+r );
	}
}

class fan_1
{
    	public static void main(String[] args)
    	{
      	fan constr = new fan();
        	fan constr1 = new fan("Brown",6,"da",8);
    	}
}
