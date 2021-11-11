import User from "../model/user.model";

class UserRepository {
    findAllUsers(): User[] {
        return [];
    }
}

export default new UserRepository();