
//bubble sort

void ArraySorting(int array[]){
	int length=array.length();
	int temp=0;

	for(int i=0;i<length;i++){
		for(int j=1;j<(length-1);j++)
			if(array[j-1]>arr[j])
			{
				temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}
	}
}
