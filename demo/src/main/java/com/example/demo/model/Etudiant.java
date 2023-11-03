package com.example.demo.model ;
@Data
@Entity
@AllArgsConstructor
public class Etudiant implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	
	private String Name ;
    private String Prenoun ;
    private String Class ;
    private Integer CIN ;
    private String email ;
    
    /*
    private String Average ;
    private String Subject ; 
*/

	
	

}