class app
  {
    public static void main(String,args[])
    {
       File f = new File();
      BufferReader br =null;
try{
 
  FileReader fr = new FileReader(f);
   br = new BufferReader(fr);
  String line;
  while((line = br.readLine())!=null)
    {
      System.out.println(line);
    }
  
}
      catch(Exception e)
  {
    System.out.println(e.printStackTrace());
  }
      catch(Exception e)
  {
    System.out.println(e.printStackTrace());
    
  }
finally
  {
try
  {
    br.close();
    
catch(Exception e)
  {
    System.out.println("unable to close file" f.toStrint());
  }
    catch(Exception e)
  {
    System.out.println(e.printStackTrace());
  }
    
  }
    
  }
      
    }
  }
