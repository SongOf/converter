package cn.edu.bupt.stream.adapter;

import cn.edu.bupt.stream.listener.Listener;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Description: VideoAdapter
 * @Author: czx
 * @CreateDate: 2018-12-02 19:14
 * @Version: 1.0
 */
@Slf4j
public class VideoAdapter {

    private List<Listener> listeners;

    private String name;

    public VideoAdapter(String adapterName) {
        this.name = adapterName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addListener(Listener listener){
        log.info("Add listener[{}] from VideoAdapter[{}]",listener.getName(),getName());
        return listeners.add(listener);
    }

    public boolean removeListener(Listener listener){
        log.info("remove listener[{}] from VideoAdapter[{}]",listener.getName(),getName());
        return listeners.remove(listener);
    }

    public void start() throws Exception{

    }

    public void stop(){

    }
}