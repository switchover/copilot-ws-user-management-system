<template>
  <div>
    <h2>User Modification History</h2>
    <table>
      <thead>
        <tr>
          <th>Modified Field</th>
          <th>Old Value</th>
          <th>New Value</th>
          <th>Modified By</th>
          <th>Modified At</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="history in modificationHistory" :key="history.id">
          <td>{{ history.modifiedField }}</td>
          <td>{{ history.oldValue }}</td>
          <td>{{ history.newValue }}</td>
          <td>{{ history.modifiedBy }}</td>
          <td>{{ history.modifiedAt }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      modificationHistory: []
    };
  },
  created() {
    this.fetchModificationHistory();
  },
  methods: {
    fetchModificationHistory() {
      // Add logic to fetch user modification history from the backend
      console.log('Fetching user modification history...');
      // Example data
      this.modificationHistory = [
        {
          id: 1,
          modifiedField: 'Name',
          oldValue: 'John Doe',
          newValue: 'John Smith',
          modifiedBy: 'Admin',
          modifiedAt: '2023-01-01 12:00:00'
        },
        {
          id: 2,
          modifiedField: 'Email',
          oldValue: 'john.doe@example.com',
          newValue: 'john.smith@example.com',
          modifiedBy: 'Admin',
          modifiedAt: '2023-01-02 14:30:00'
        }
      ];
    }
  }
};
</script>

<style scoped>
/* Add your styles here */
</style>
