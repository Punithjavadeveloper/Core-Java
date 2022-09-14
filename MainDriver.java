class MainDriver 
{
	public static void main(String[] args) 
	{
		Project project=new Project();
		//getting the data before initialization
		System.out.println("Project id "+project.getId());
		System.out.println("Project name "+project.getName());
		
		//initalization
		project.setId(100);
		project.setName("java");
         
         //getting the data after initialization
		System.out.println("Project id "+project.getId());
		System.out.println("Project name "+project.getName());
	}
}
