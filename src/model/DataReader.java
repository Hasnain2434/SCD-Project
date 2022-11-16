package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class DataReader {
	private List<List<String>> data;
	private ArrayList<String> header;
	public DataReader()
	{
		data= new ArrayList<List<String>>();
		header=new ArrayList<String>();
	}
	public void readData(String path)
	{
		String line = "";  
		String splitBy = ",";
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		File file=new File(path);
		FileReader filereader=new FileReader(file);
		BufferedReader br = new BufferedReader(filereader); 
		int row=0;
		int column;
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{
			String[] columns=line.split(splitBy);
			column=0;
			if(row!=0)
			{
				data.add(new ArrayList<String>());
				while(column<columns.length)
				{
					data.get(row-1).add(columns[column]);
					if(column==3||column==1)
					{
						data.get(row-1).add(this.makeUnvocalized(columns[column]));
					}
					column++;
				}
			}
			else
			{
				while(column<columns.length)
				{
					header.add(columns[column]);
					column++;
				}
			}
			row++;
		}
		br.close();
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}
	}
	
	public void viewData()

	{
		for(int i=0;i<header.size();i++)
		{
			System.out.print(header.get(i)+" , ");
		}
		System.out.println();
		for(int i=0;i<data.size();i++)
		{
			for(int j=0;j<data.get(i).size();j++)
			{
				System.out.print(data.get(i).get(j)+" , ");
			}
			System.out.println();
		}
	}
	public List<List<String>> getData() {
		return data;
	}
	public ArrayList<String> getHeader() {
		return header;
	}
	
	private String makeUnvocalized(String vocalized)
	{
		vocalized=vocalized.replaceAll("\u0610", "");//ARABIC SIGN SALLALLAHOU ALAYHE WA SALLAM
        vocalized=vocalized.replaceAll("\u0611", "");//ARABIC SIGN ALAYHE ASSALLAM
        vocalized=vocalized.replaceAll("\u0612", "");//ARABIC SIGN RAHMATULLAH ALAYHE
        vocalized=vocalized.replaceAll("\u0613", "");//ARABIC SIGN RADI ALLAHOU ANHU
        vocalized=vocalized.replaceAll("\u0614", "");//ARABIC SIGN TAKHALLUS

        //Remove koranic anotation
        vocalized=vocalized.replaceAll("\u0615", "");//ARABIC SMALL HIGH TAH
        vocalized=vocalized.replaceAll("\u0616", "");//ARABIC SMALL HIGH LIGATURE ALEF WITH LAM WITH YEH
        vocalized=vocalized.replaceAll("\u0617", "");//ARABIC SMALL HIGH ZAIN
        vocalized=vocalized.replaceAll("\u0618", "");//ARABIC SMALL FATHA
        vocalized=vocalized.replaceAll("\u0619", "");//ARABIC SMALL DAMMA
        vocalized=vocalized.replaceAll("\u061A", "");//ARABIC SMALL KASRA
        vocalized=vocalized.replaceAll("\u06D6", "");//ARABIC SMALL HIGH LIGATURE SAD WITH LAM WITH ALEF MAKSURA
        vocalized=vocalized.replaceAll("\u06D7", "");//ARABIC SMALL HIGH LIGATURE QAF WITH LAM WITH ALEF MAKSURA
        vocalized=vocalized.replaceAll("\u06D8", "");//ARABIC SMALL HIGH MEEM INITIAL FORM
        vocalized=vocalized.replaceAll("\u06D9", "");//ARABIC SMALL HIGH LAM ALEF
        vocalized=vocalized.replaceAll("\u06DA", "");//ARABIC SMALL HIGH JEEM
        vocalized=vocalized.replaceAll("\u06DB", "");//ARABIC SMALL HIGH THREE DOTS
        vocalized=vocalized.replaceAll("\u06DC", "");//ARABIC SMALL HIGH SEEN
        vocalized=vocalized.replaceAll("\u06DD", "");//ARABIC END OF AYAH
        vocalized=vocalized.replaceAll("\u06DE", "");//ARABIC START OF RUB EL HIZB
        vocalized=vocalized.replaceAll("\u06DF", "");//ARABIC SMALL HIGH ROUNDED ZERO
        vocalized=vocalized.replaceAll("\u06E0", "");//ARABIC SMALL HIGH UPRIGHT RECTANGULAR ZERO
        vocalized=vocalized.replaceAll("\u06E1", "");//ARABIC SMALL HIGH DOTLESS HEAD OF KHAH
        vocalized=vocalized.replaceAll("\u06E2", "");//ARABIC SMALL HIGH MEEM ISOLATED FORM
        vocalized=vocalized.replaceAll("\u06E3", "");//ARABIC SMALL LOW SEEN
        vocalized=vocalized.replaceAll("\u06E4", "");//ARABIC SMALL HIGH MADDA
        vocalized=vocalized.replaceAll("\u06E5", "");//ARABIC SMALL WAW
        vocalized=vocalized.replaceAll("\u06E6", "");//ARABIC SMALL YEH
        vocalized=vocalized.replaceAll("\u06E7", "");//ARABIC SMALL HIGH YEH
        vocalized=vocalized.replaceAll("\u06E8", "");//ARABIC SMALL HIGH NOON
        vocalized=vocalized.replaceAll("\u06E9", "");//ARABIC PLACE OF SAJDAH
        vocalized=vocalized.replaceAll("\u06EA", "");//ARABIC EMPTY CENTRE LOW STOP
        vocalized=vocalized.replaceAll("\u06EB", "");//ARABIC EMPTY CENTRE HIGH STOP
        vocalized=vocalized.replaceAll("\u06EC", "");//ARABIC ROUNDED HIGH STOP WITH FILLED CENTRE
        vocalized=vocalized.replaceAll("\u06ED", "");//ARABIC SMALL LOW MEEM

        //Remove tatweel
        vocalized=vocalized.replaceAll("\u0640", "");

        //Remove tashkeel
        vocalized=vocalized.replaceAll("\u064B", "");//ARABIC FATHATAN
        vocalized=vocalized.replaceAll("\u064C", "");//ARABIC DAMMATAN
        vocalized=vocalized.replaceAll("\u064D", "");//ARABIC KASRATAN
        vocalized=vocalized.replaceAll("\u064E", "");//ARABIC FATHA
        vocalized=vocalized.replaceAll("\u064F", "");//ARABIC DAMMA
        vocalized=vocalized.replaceAll("\u0650", "");//ARABIC KASRA
        vocalized=vocalized.replaceAll("\u0651", "");//ARABIC SHADDA
        vocalized=vocalized.replaceAll("\u0652", "");//ARABIC SUKUN
        vocalized=vocalized.replaceAll("\u0653", "");//ARABIC MADDAH ABOVE
        vocalized=vocalized.replaceAll("\u0654", "");//ARABIC HAMZA ABOVE
        vocalized=vocalized.replaceAll("\u0655", "");//ARABIC HAMZA BELOW
        vocalized=vocalized.replaceAll("\u0656", "");//ARABIC SUBSCRIPT ALEF
        vocalized=vocalized.replaceAll("\u0657", "");//ARABIC INVERTED DAMMA
        vocalized=vocalized.replaceAll("\u0658", "");//ARABIC MARK NOON GHUNNA
        vocalized=vocalized.replaceAll("\u0659", "");//ARABIC ZWARAKAY
        vocalized=vocalized.replaceAll("\u065A", "");//ARABIC VOWEL SIGN SMALL V ABOVE
        vocalized=vocalized.replaceAll("\u065B", "");//ARABIC VOWEL SIGN INVERTED SMALL V ABOVE
        vocalized=vocalized.replaceAll("\u065C", "");//ARABIC VOWEL SIGN DOT BELOW
        vocalized=vocalized.replaceAll("\u065D", "");//ARABIC REVERSED DAMMA
        vocalized=vocalized.replaceAll("\u065E", "");//ARABIC FATHA WITH TWO DOTS
        vocalized=vocalized.replaceAll("\u065F", "");//ARABIC WAVY HAMZA BELOW
        vocalized=vocalized.replaceAll("\u0670", "");//ARABIC LETTER SUPERSCRIPT ALEF

        return vocalized;
	}
}