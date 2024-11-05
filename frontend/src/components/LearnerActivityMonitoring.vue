<template>
  <div>
    <h2>Learner Activity Monitoring</h2>
    <table>
      <thead>
        <tr>
          <th>Learner ID</th>
          <th>Activity</th>
          <th>Timestamp</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="activity in learnerActivities" :key="activity.id">
          <td>{{ activity.learnerId }}</td>
          <td>{{ activity.activity }}</td>
          <td>{{ activity.timestamp }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      learnerActivities: []
    };
  },
  created() {
    this.fetchLearnerActivities();
  },
  methods: {
    fetchLearnerActivities() {
      // Add logic to fetch learner activities from the backend
      console.log('Fetching learner activities...');
      // Example data
      this.learnerActivities = [
        {
          id: 1,
          learnerId: 'L001',
          activity: 'Completed Course A',
          timestamp: '2023-01-01 10:00:00'
        },
        {
          id: 2,
          learnerId: 'L002',
          activity: 'Started Course B',
          timestamp: '2023-01-02 11:30:00'
        }
      ];
    }
  }
};
</script>

<style scoped>
/* Add your styles here */
</style>
