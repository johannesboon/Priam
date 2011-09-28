package com.priam.identity;

import java.io.Serializable;
import java.util.Map;

import com.netflix.instance.identity.StorageDevice;

public class PriamInstance implements Serializable
{
    private static final long serialVersionUID = 5606412386974488659L;
    public String app;
    public int Id;
    public String instanceId;
    public String availabilityZone;
    public String publicip;
    public String location;
    public String payload;
    public Map<String, StorageDevice> volumes;
    private String hostname;
    private long updatetime;
    
    public String getApp()
    {
        return app;
    }

    public void setApp(String app)
    {
        this.app = app;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public String getInstanceId()
    {
        return instanceId;
    }

    public void setInstanceId(String instanceId)
    {
        this.instanceId = instanceId;
    }

    public String getRac()
    {
        return availabilityZone;
    }

    public void setRac(String availabilityZone)
    {
        this.availabilityZone = availabilityZone;
    }

    public String getHostName()
    {
        return hostname;
    }
    
    public String getHostIP()
    {
        return publicip;
    }

    public void setHost(String hostname, String publicip)
    {
        this.hostname = hostname;
        this.publicip = publicip;
    }

    public void setHost(String hostname)
    {
        this.hostname = hostname;
    }

    public void setHostIP(String publicip)
    {
        this.publicip = publicip;
    }

    public String getPayload()
    {
        return payload;
    }

    public void setPayload(String payload)
    {
        this.payload = payload;
    }

    public Map<String, StorageDevice> getVolumes()
    {
        return volumes;
    }

    public void setVolumes(Map<String, StorageDevice> volumes)
    {
        this.volumes = volumes;
    }

    @Override
    public String toString()
    {
        return String.format("Hostname: %s, InstanceId: %s, APP_NAME: %s, RAC : %s Location %s, Slot: %s: Token: %s", getHostName(), getInstanceId(), getApp(), getRac(), getDC(), getId(),
                getPayload());
    }

    public String getDC()
    {
        return location;
    }
    
    public void setDC(String location)
    {
        this.location = location;
    }

    public long getUpdatetime()
    {
        return updatetime;
    }

    public void setUpdatetime(long updatetime)
    {
        this.updatetime = updatetime;
    }

}
