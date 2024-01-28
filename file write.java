class app
  {
    public static void main(String args[])
    {
File file = new File("text.txt");
      BufferWriter br = new BufferWriter(FileWriter(file));
      br.newLine("this is line one");
      br.newLine();
      br.newLine("this is line two");
      br.newLine();
      
    }
  }
