public class SortSoftwareProject
{
	
	public static void main(String[] args)
	{
		SoftwareProject[] projects = new SoftwareProject[6];

		projects[0] = new SoftwareProject("Liam", 'S', 'D');
		projects[1] = new SoftwareProject("Tom", 'M', 'D');
		projects[2] = new SoftwareProject("Alan", 'L', 'C');
        projects[3] = new SoftwareProject("Jack", 'S', 'D');
        projects[4] = new SoftwareProject("Steve", 'M', 'Q');
        projects[5] = new SoftwareProject("John", 'L', 'Q');

		bubbleSort(projects);

        for(int i =0 ; i < projects.length; i++)
        {
            System.out.println(projects[i].getCustomerName());
        }
	}

    public static void bubbleSort(SoftwareProject[] projects)
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        SoftwareProject temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < projects.length - 1;  j++ )
            {
                if(projects[j].getCustomerName().compareTo(projects[j+1].getCustomerName()) > 0)
                {
                    temp = projects[ j ];                //swap elements
                    projects[ j ] = projects[ j+1 ];
                    projects[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred  
                } 
            } 
        } 
    }
}