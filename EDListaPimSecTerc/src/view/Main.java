package view;

import matheus.ListaInt.ListaInt;

public class Main {

	public static void main(String[] args) 
	{
		int[] vet1 = {1, 7};
		int[] vet2 = {3, 4, 6};
		
		ListaInt prim = new ListaInt();
		ListaInt sec = new ListaInt();
		ListaInt terc = new ListaInt();
		
		int tam1 = vet1.length;
		int tam2 = vet2.length;
		
		try {
			for (int i = 0; i < tam1; i++)
			{
				if(prim.isEmpty())
				{
					prim.addFirst(vet1[i]);
				}
				else
				{
					prim.addLast(vet1[i]);
				}
			}
			for (int i = 0; i < tam2; i++)
			{
				if(sec.isEmpty())
				{
					sec.addFirst(vet2[i]);
				}
				else
				{
					sec.addLast(vet2[i]);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		for (int i = 0; i < (prim.size() > sec.size() ? prim.size() : sec.size()); i++)
		{
			try {
				if (prim.size() > sec.size() ? i < sec.size() : i < prim.size())
				{
					terc.addFirst(prim.get(i));					
				}
				if (prim.size() < sec.size() ? i < sec.size() : i < prim.size())
				{
					terc.addFirst(sec.get(i));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		for (int i = 0; i < terc.size(); i++)
		{
			int cont = 0;
			for (int j = 0; j < terc.size(); j++)
			{
				try {
				   if (terc.get(i) == terc.get(j))
				   {
					   if (cont != 0)
					   {
						   terc.remove(j);
					   }
					   cont++;
				   }
			   } catch (Exception e) {
				   e.printStackTrace();
			   }
		   }
		}
		
		for(int i = 0; i < terc.size(); i++) //Ordena valores
		{
			for (int j = 0; j < terc.size(); j++)
			{
				try {
					if(terc.get(i) < terc.get(j))
					{
						int aux = terc.get(i);
						terc.add(terc.get(j), i);
						terc.remove(i+1);
						terc.add(aux, j);
						terc.remove(j+1);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		while(!terc.isEmpty())
		{
			try {
				System.out.println(terc.get(0));
				terc.removeFirst();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
