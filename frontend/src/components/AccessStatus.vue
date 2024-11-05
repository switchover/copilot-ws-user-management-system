<template>
  <div>
    <h2>Access Status</h2>
    <table>
      <thead>
        <tr>
          <th>User ID</th>
          <th>Name</th>
          <th>Last Login</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="user in users" :key="user.id">
          <td>{{ user.id }}</td>
          <td>{{ user.name }}</td>
          <td>{{ user.lastLogin }}</td>
          <td>{{ user.status }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      users: []
    };
  },
  created() {
    this.fetchAccessStatus();
  },
  methods: {
    fetchAccessStatus() {
      // Add logic to fetch access status data
      // For now, we'll use dummy data
      this.users = [
        { id: 1, name: 'John Doe', lastLogin: '2023-01-01', status: 'Active' },
        { id: 2, name: 'Jane Smith', lastLogin: '2023-01-02', status: 'Inactive' },
        { id: 3, name: 'Alice Johnson', lastLogin: '2023-01-03', status: 'Active' }
      ];
    }
  }
};
</script>

<style scoped>
/* Add your styles here */
</style>
