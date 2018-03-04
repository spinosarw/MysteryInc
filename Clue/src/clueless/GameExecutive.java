/**
 * 
 */
package clueless;

import java.io.IOException;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Server;

/**
 * @author joshfry
 *
 */
public class GameExecutive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Server server = new Server();
	    server.start();
	    try {
			server.bind(54555, 54777);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    server.addListener(new Listener() {
	        public void received (Connection connection, Object object) {
	           if (object instanceof Player) {
	              Player request = (Player) object;
	              System.out.println(request.text);
	     
	              Card response = new Card();
	              response.text = "Thanks";
	              connection.sendTCP(response);
	           }
	        }
	     });
	}

}
