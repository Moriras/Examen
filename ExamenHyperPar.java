public static boolean hyperPar (int num) {
	int resto;
	//En esta otra linea, tambien creare un conflicto mayor,
	//con 2 lineas concretamente. Y una variable
	String pepe;
	if(num>=0)
	{
		while(num!=0)
    	{
			resto=num%10;
			num=num/10;
			if(resto%2 != 0)
			{
				return false;
			}
		}
		return true;
	}
	else{
		return false;
	}
}