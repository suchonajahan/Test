package repository.remoteRepo.responseRepo;

public class UserPutApiResponseModel {


    /**
     * name : morpheus
     * job : leader
     * updatedAt : 2023-02-24T06:36:55.653Z
     */

    private String name;
    private String job;
    private String updatedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
