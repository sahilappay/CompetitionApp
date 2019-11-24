package config;

import beans.User;
import util.FileUtil;

public class Initialization {
    public static Config config = null;
    public static void initializeConfig(User user){
        config = new Config(user);
        try {
            Object configObj = FileUtil.readObjectFromFile("config.ser");
                if (configObj == null){
                    config.setUser(user);
                }else {
                    config = (Config) configObj;
                }
        }catch (Exception ex){
            //ignore
            ex.printStackTrace();
        }
    }

    public static void refreshConfig(){
        FileUtil.writeObjectToFile(config, "config.ser");
    }
}
