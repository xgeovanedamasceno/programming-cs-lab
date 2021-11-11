import { Pool } from "pg";

const connectionString = 'postgres://kphpvrdr:5vL7DZnVlUDonE0vBLzJk0OifNEi-68j@kesavan.db.elephantsql.com/kphpvrdr';
const db = new Pool({ connectionString });

export default db;