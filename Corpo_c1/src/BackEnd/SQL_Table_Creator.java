/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.util.ArrayList;


/**
 *
 * @author Aluno
 */
public class SQL_Table_Creator {
    private ArrayList<SQL_Table_Field> Fields = new ArrayList();
    private String Table_Name;
    public SQL_Table_Creator(String Table_Name)
    {
        this.Table_Name = Table_Name;
    }
    
    public void Add_Field(String Field_Name, String Datatype, boolean Not_Null, boolean Auto_Increment)
    {
        SQL_Table_Field field = new SQL_Table_Field(Field_Name, Datatype, Not_Null, Auto_Increment);
        Fields.add(field);
    }
    
    public boolean Remove_Field(String Field_Name)
    {
        for(SQL_Table_Field field : Fields)
        {
            if(field.Get_Field_Name().equals(Field_Name))
            {
                return Fields.remove(field);
            }
        }
        return false;
    }
    
    public void Set_Table_Name(String name)
    {
        this.Table_Name = name;
    }
    
    public String Get_Create_Text()
    {
        return "";
    }
}
